pipeline {
    agent any
    tools {
        // Specify the Maven tool version
        maven 'maven-3.9'
    }
    stages {
        stage("build jar") {
            steps {
                script {
                    echo "Building the application.."
                    sh 'mvn package'
                }
            }
        }
        stage("build image") {
            steps {
                script {
                    echo "Building the Docker image.."
                    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
                        // Use withCredentials block properly
                        sh 'docker build -t ahmedfarag0011/my-repo:jma-2.0 .'
                        sh "echo $PASS | docker login -u $USER --password-stdin"
                        sh "docker push ahmedfarag0011/my-repo:jma-2.0"
                    }
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    echo "Deploying the application.."
                }
            }
        }
    }
}
