def call(){
  sh "trivy fs --format table -o fs-scan.html ."

}
