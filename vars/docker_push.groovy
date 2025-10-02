def call(String Project, String ImageTag, String dockerhubuserParam){
    withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'DOCKER_PASSWORD', usernameVariable: 'DOCKER_USERNAME')]) {
        sh "echo \$DOCKER_PASSWORD | docker login -u \$DOCKER_USERNAME --password-stdin"
    }
    sh "docker push ${dockerhubuserParam}/${Project}:${ImageTag}"
}
