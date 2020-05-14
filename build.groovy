def entry_point() {
    dir("$WORKSPACE/jenkins-credentials-check") {
        withCredentials([usernameColonPassword(credentialsId: 'jenkins-avirek-creds', variable: 'CREDENTIALS')]) {
            sh "ls"
            sh "echo $pwd"
            sh "echo $WORKSPACE"
            sh "echo $CREDENTIALS"
            sh "$WORKSPACE/jenkins-credentials-check/check_output $CREDENTIALS"
        }
    }
}
return this;

