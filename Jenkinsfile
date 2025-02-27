pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/GnanendharReddy8/SPE.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        success {
            echo 'Build and tests passed!'
        }
        failure {
            echo 'Build or tests failed!'
        }
    }
}
