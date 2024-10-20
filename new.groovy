pipeline{
  agent any
  stages{
    stage('Buiding'){
      steps{
        echo 'Building stages Running...'
        echo "Running ${env.BUILD_ID} ${env.BUILD_DISPLAY_NAME} on ${env.NODE_NAME} and JOB ${env.JOB_NAME}"
      }
    }
    stages('Testing'){
      steps{
        echo 'Testing Stages Running...'
      }
    }
    stages('Deploying'){
      steps{
        echo 'Deploying Stages Running...'
      }
    }
  }
}

        
