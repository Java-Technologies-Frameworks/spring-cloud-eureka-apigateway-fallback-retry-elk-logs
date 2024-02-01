create logstash.conf file and place below codes.
after creating the file , move the file to config.
If its not working move the file to bin directory.
input {
    file {
	  path => "D:/Qualigytech-Springboot/elk_logs_folder/elk.log"
	  start_position => "beginning"
    }
}

output {

  stdout {
    codec =>rubydebug
  }
  # sending properly parsed log to elasticsearch 
  elasticsearch {
     hosts => ["localhost:9200"]
  }
}
