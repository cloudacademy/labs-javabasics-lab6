# make executed inside test directory; set paths relative to test directory
one:
	whoami 1>&2
	pwd 1>&2
	ls -la 1>&2
	ls -la * 1>&2
	ls -la ../ 1>&2
	echo "building src" 1>&2
	javac -d ../classes ../src/*One*.java 1>&2
	echo "full test" 1>&2
	javac -d ../classes ../src/*One*.java && javac -cp ../lib/junit-4.10.jar:../classes -d ../classes *One*.java && java -cp ../lib/junit-4.10.jar:../classes TestRunnerOne
two:
	javac -d ../classes ../src/*Two*.java && javac -cp ../lib/junit-4.10.jar:../classes -d ../classes *Two*.java && java -cp ../lib/junit-4.10.jar:../classes TestRunnerTwo
three:
	javac -d ../classes ../src/*Three*.java && javac -cp ../lib/junit-4.10.jar:../classes -d ../classes *Three*.java && java -cp ../lib/junit-4.10.jar:../classes TestRunnerThree