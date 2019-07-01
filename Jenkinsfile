pipeline {
    agent any

    stages {
        stage('Assemble') {
            steps {
                sh './quickstart/gradlew assemble -p quickstart/'
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
