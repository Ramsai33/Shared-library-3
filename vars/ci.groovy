def call() {
    node('workstation') {
        stage('checkout') {
            cleanWs()
            git branch: 'main', url: "https://github.com/Ramsai33/${component}.git"
            sh 'env'
        }
    }
}