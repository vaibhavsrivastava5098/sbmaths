pipeline {
    agent any

    environment {
        // Define any environment variables here
        // EXAMPLE_VAR = 'value'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the repository
                git url: 'https://github.com/vaibhavsrivastava5098/sbmaths.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                // Add your build commands here
                // For example, if you're using Maven:
                // sh 'mvn clean package'

                // Or for a Node.js project:
                // sh 'npm install'
            }
        }

        stage('Test') {
            steps {
                // Add your testing commands here
                // For example, if you're using Maven:
                // sh 'mvn test'

                // Or for a Node.js project:
                // sh 'npm test'
            }
        }

        stage('Deploy') {
            steps {
                // Add your deployment commands here
                // For example, deploying to a server or creating a Docker image
                // sh 'deploy_script.sh'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
        always {
            // Always run these steps
            echo 'Cleaning up...'
        }
    }
}
