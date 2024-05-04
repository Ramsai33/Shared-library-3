def call() {
    node('workstation') {
        stage('checkout') {
            cleanws()
            git branch: 'main', url: "https://github.com/Ramsai33/${component}.git"
            sh 'env'
        }
    }
}