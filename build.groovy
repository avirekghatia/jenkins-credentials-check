def entry_point {
    withCredentials([usernameColonPassword('jenkins-avirek-creds', variable: 'CREDENTIALS')]) {
        sh "echo $CREDENTIALS"
        sh "curl -u $CREDENTIALS google.com"
    }
}
return this;

