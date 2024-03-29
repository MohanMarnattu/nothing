def gitDownload(repo){
  git "https://github.com/intelliqittrainings/${repo}.git"
}
def mavenBuild(){
  sh "mvn package"
}
def deploy(jobname,ip,path){
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${path}.war"
}
def push(jobname){
  sh "java - jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}
