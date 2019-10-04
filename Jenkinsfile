pipeline {
    agent any
    environment {
        //be sure to replace Your "IMAGE_NAME" 
        DOCKER_IMAGE_NAME = "ravindrasingh6969/myapp"
           // Slack configuration 
    SLACK_CHANNEL       = "#test" 
    SLACK_COLOR_DANGER  = "#E01563" 
    SLACK_COLOR_INFO    = "#6ECADC" 
    SLACK_COLOR_WARNING = "#FFC300" 
    SLACK_COLOR_GOOD    = "#3EB991" 
    JOB_NAME            = "#p"
 
    }
    stages {
        stage('Build') {
            steps {
                echo 'Running build automation'
                sh './gradlew build --no-daemon'
                archiveArtifacts artifacts: 'dist/trainSchedule.zip'
            }
        }
        stage('Build Docker Image') {
            when {
                branch 'master'
            }
            steps {
                script {
                    app = docker.build(DOCKER_IMAGE_NAME)
                    app.inside {
                        sh 'echo Hello, World!'
                    }
                }
            }
        }
 }       
