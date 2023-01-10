pipeline {
    agent any 
    stages {
        stage('Clean') {
            steps {
                script {
                    try {
                        //sh "docker stop midas_react_container"
                        //sh "docker stop midas_spring_container"
                        sleep 1  
                        //sh "docker rm midas_react_container"
                        //sh "docker rm midas_spring_container"
echo "hi"
                    } catch (error) {
                        echo error
                        sh 'exit 0'
                    }
                }
            }
        }

        stage('Build') {
            steps {
                sh "docker build -t midas_react ./frontend_service"
                sh "docker build -t midas_spring ./backend"
            }
        }

        stage('Deploy') {
            steps {
                sh "docker run -d  -e TZ=Asia/Seoul --name=motoo_react_container -p 4000:4000 -p 8081:80 midas_react"
                
                sh "docker run -d -e TZ=Asia/Seoul --name=midas_spring_container -p 8080:8080 midas_spring"

                sh "docker image prune --force"

            }
        }
    }
}