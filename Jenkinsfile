pipeline {
    agent any
    stages {
        stage('Assemble') {
            steps {
                echo 'Compiling..'
                sh './quickstart/gradlew assemble -p quickstart'
                archiveArtifacts 'quickstart/build/libs/*.jar'
            }
        }
        stage('Unit Test') {
            parallel {
                stage('Unit Tests 1') { 
                    steps {
                        echo 'Executing Unit Tests 1 ..'
                        sh './quickstart/gradlew test -p quickstart/'
                    }
                    post {
                        always {
                            junit "quickstart/build/test-results/test/*.xml"
                            archiveArtifacts 'quickstart/build/reports/tests/test/*'
                        }
                    }
                }
                stage('Unit Tests 2') { 
                    steps {
                        echo 'Executing Unit Tests 2 ..'
                        sh './quickstart/gradlew test -p quickstart/'
                    }
                }
            }
        }
        stage('Code analysis') {
            steps {
                echo 'Executing Code analysis ..'
                sh './quickstart/gradlew check -p quickstart/'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
    post {
        success {
            mail to: 'areliez.vargas@gmail.com',
                subject: "Success Pipeline: ${currentBuild.fullDisplayName}",
                body: "The build was successful: ${env.BUILD_URL}"
        }
    }
}
