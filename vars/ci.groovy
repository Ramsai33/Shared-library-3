def call() {
    node('workstation') {
        stage('Checkout') {
            cleanWs()
            git branch: 'main', url: "https://github.com/Ramsai33/cart.git"
            sh 'env'
        }
        stage('Build') {
            echo 'Hello'
        }
    }
}