def entry_point() {
    withCredentials([usernameColonPassword(credentialsId: 'jenkins-avirek-creds', variable: 'CREDENTIALS')]) {
        sh "echo $WORKSPACE"
        dir('$WORKSPACE/jenkins-credentials-check') {
            sh "echo $CREDENTIALS"
            sh "./check_output $CREDENTIALS"
        }
    }
}
return this;

