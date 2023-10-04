def call(Map config = [:]) {
    def fileContents = libraryResource 'test.properties'
    props = readProperties(text:fileContents)
    env.var1 = props.var1
    sh "echo $var1"
}