pipeline {
  agent any
  stages {
    stage('Preperation') {
      steps {
        echo 'It is the preperation first step'
        echo 'Prperation 2nd Step'
      }
    }
    stage('Build') {
      steps {
        echo 'Build First Step'
        echo 'Build Step-2'
        bat 'mvn clean package'
        echo 'Code is compiled and JAR created'
      }
    }
    stage('Test') {
      steps {
        echo 'Test1'
      }
    }
    stage('Deploye') {
      steps {
        echo 'Deploye Msg1'
      }
    }
  }
  environment {
    JAVA_HOME = 'C:\\Program Files\\Java\\jdk1.8.0_144'
    MAVEN_HOME = 'D:\\apache-maven-3.5.3'
  }
}