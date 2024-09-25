pipeline {
    agent any

    environment {
        JAVA_HOME = 'C:/Program Files/Java/jdk-17/'  // Set the path to your Java 17 installation
        MAVEN_HOME = 'C:/work/apache-maven-3.9.0/'   // Set the path to your Maven installation
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the repository
                git url: 'https://github.com/vaibhavsrivastava5098/sbmaths.git', branch: 'master'
            }
        }

        stage('Build') {
            steps {
                // Build the project using Maven
                echo 'Building the Spring Boot application...'
                sh "${MAVEN_HOME}/bin/mvn clean package"
            }
        }

        stage('Test') {
            steps {
                // Run tests using Maven
                echo 'Running tests...'
                sh "${MAVEN_HOME}/bin/mvn test"
            }
        }

        stage('Deploy') {
            steps {
                // Deploy the application (customize this part as needed)
                echo 'Deploying the Spring Boot application...'
                // You can include deployment commands here, such as:
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
