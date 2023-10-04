def call(String team) {
    def fileContents = libraryResource team + '.properties'
    props = readProperties(text:fileContents)
    env.var1 = props.var1
    creds = props.creds
    withCredentials([usernamePassword(credentialsId: creds, usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]){
        sh "echo $var1"
        sh "echo $USERNAME"
    }
}