def gv
pipeline {
    agent any
    tools {
        maven 'maven-3.9'
    }
    stages{
        stage("build jar"){
            steps {
                script {
                    gv.buildjar()
                }
            }    
        }
        stage("build image"){
            steps {
                script {
                    gv.buildimage()
                }
            }
        }
        stage("deploy"){
           steps {
                script {
                    gv.deployApp()

                }
            }
        }
    }
}
