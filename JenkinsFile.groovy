pipeline {
    agent any

    stages {
        stage('Git Clone') {
            steps {
                git branch: 'main', credentialsId: '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', url: 'https://github.com/MathieuT7/TP-Devops.git'
            }
        }
    }
}