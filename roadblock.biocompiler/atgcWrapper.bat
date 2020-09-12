rem Wrapper for atgc
rem C .Ladroue

cd %~dp0 

java -Djava.library.path=resources/sqlite4java -jar atgc.jar %1 resources %2 %3
