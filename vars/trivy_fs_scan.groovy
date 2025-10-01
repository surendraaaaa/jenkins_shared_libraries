def call(){
  sh "trivy filesystem --format table -o fs-scan.html ."

}

