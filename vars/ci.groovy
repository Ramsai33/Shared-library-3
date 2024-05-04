def call() {
    node('workstation') {
        stage('Checkout') {
            cleanWs()
            git branch: 'main', url: "https://github.com/Ramsai33/${component}.git"

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
        stage('Placing artifacts in centrilise Place') {
            echo 'Hello'
        }
    }
}