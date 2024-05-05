def call() {
    if(!env.TAG_NAME) {
        env.PUSH_CODE = "FALSE"
    }
    else {
        env.PUSH_CODE = "TRUE"
    }
    node('workstation') {
        stage('Checkout') {
            cleanWs()
            git branch: 'main', url: "https://github.com/Ramsai33/cart.git"
            sh 'env'
        }
        stage('build') {
            common.compile()
        }
        stage('Unittest') {
            echo 'Hello'
        }
        stage('Qualitycheck') {
            echo 'Hello'
        }
        if(env.PUSH_CODE == "TRUE") {
        stage('Placing artifacts in centrilise Place') {
            common.artifactspush()
           }
        }
    }
}