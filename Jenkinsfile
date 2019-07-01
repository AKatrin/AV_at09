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
            steps {
                sh './quickstart/gradlew test -p quickstart/'
            }
        }
        stage('Upload Artifacts') {
            steps {
                sh './quickstart./gradlew uploadArchives'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
  }
