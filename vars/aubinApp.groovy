def call(String repoUrl){
pipeline{
  agent any  
  stages{
    stage('1-clone'){
      when{
        branch 'feature'
      }
      steps{
        echo 'welcom to Etech-Team5-Group6'
      }
    }
    stage('2-parallel-job'){
      when{
        branch 'dev'
      }
      parallel{
        stage('1-parallel-sub-Saada-job1'){
          when{
            branch 'main'
          }
          steps{
            sh 'lscpu'
            sh 'systemctl status jenkins'
          }
        }
        stage('2-parallel-job Francis-job2'){
          steps{
            sh 'df -h'
          }
        }
        stage('3-parallel-job Nelson-job3'){
          steps{
            sh 'df -h'
          }
        }
        stage('4-parallel-job Aubin-job4'){
          steps{
            sh 'ls'
          }
        }
