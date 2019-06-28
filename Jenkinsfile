pipeline {
    agent any

    stages {
        stage('Assemble') {
            steps {
                sh './gradlew assemble'
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Unit Test') {
            steps {
                sh './gradlew test'
            }
        }
        stage('Upload Artifacts') {
            steps {
                sh './gradlew uploadArchives'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}