def entry_point() {
    withCredentials([usernameColonPassword(credentialsId: 'jenkins-avirek-creds', variable: 'CREDENTIALS')]) {
        sh "echo $WORKSPACE"
        sh "echo $CREDENTIALS"
        sh "./jenkins-credentials-check/check_output $CREDENTIALS"
    }
}
return this;

