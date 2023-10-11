def call(String team) {
    def fileContents = libraryResource team + '.properties'
    props = readProperties(text:fileContents)
    env.var1 = props.var1
    creds = props.creds
}