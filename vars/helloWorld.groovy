def call(Map config = [:]) {
    props = readProperties(file:'test.properties')
    env.var1 = props.var1
    sh "echo $var1"
}