def gv
pipeline {
    agent any
    tools {
        maven 'Maven'
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
