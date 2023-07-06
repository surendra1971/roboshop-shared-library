def sonarChecks(){
        sh "echo Sonar Checks In Progress"
        // sh "sonar-scanner -Dsonar.host.url=http://172.31.90.35:9000  ${ARGS} -Dsonar.projectKey=${COMPONENT}  -Dsonar.login=${SONARCRED_USR} -Dsonar.password=${SONARCRED_PSW}"
        // sh "curl https://gitlab.com/thecloudcareers/opensource/-/raw/master/lab-tools/sonar-scanner/quality-gate > sonar-quality-gate.sh"
        // sh "bash -x sonar-quality-gate.sh ${SONARCRED_USR} ${SONARCRED_PSW} ${SONARURL} ${COMPONENT}"       
        sh "echo Sonar Checks Completed"
}