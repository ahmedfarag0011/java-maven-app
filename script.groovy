def buildJar() {
    echo "Building the application.."
    sh 'mvn package'
}

def buildImage() {
    echo "Building the Docker image.."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t ahmedfarag0011/my-repo:jma-2.0 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh "docker push ahmedfarag0011/my-repo:jma-2.0"
    }
}

def deployApp() {
    echo "Deploying the application.."
}

return this
