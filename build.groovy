def entry_point() {
    withCredentials([usernameColonPassword(credentialsId: 'jenkins-avirek-creds', variable: 'CREDENTIALS')]) {
        sh "echo $pwd"
        sh "echo $WORKSPACE"
        sh "echo $CREDENTIALS"
        sh "./check_output $CREDENTIALS"
    }
}
return this;

