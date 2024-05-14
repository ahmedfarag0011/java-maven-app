pipeline{

    agent any

    stages {
        stages("uild") {
            steps {
                echo 'building the application..'
            }
        }
        stages("test") {
            steps {
                echo 'testing the application..'
            }
    }

    stages("deploy") {
        steps {
            echo 'deploying the application..'
        }
    }
           
    } 
}
