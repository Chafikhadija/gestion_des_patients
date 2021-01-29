pipeline {
	agent any
	stages {
		stage('build') {
			steps {
                	echo '6.9.0'
			}
		}
    	stage('Run Docker Compose File') {
        	steps {
                	echo 'docker is running ...'
        	}
    	}
    	stage('Test') {
        	steps {
                	echo 'Testing..'
        	}
    	}
    	stage('Deploy') {
    		steps {
                	echo 'Deploying....'
        	}
    	}
   }
}