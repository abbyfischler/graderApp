# https://www.cs.swarthmore.edu/~newhall/unixhelp/javamakefiles.html
# define compiler and compiler flag variables
#
JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	Grader2.java \
	InteractiveGrader.java \
	Grader3.java


default: classes

classes: $(CLASSES:.java=.class)
	@echo
	@echo -----------------------------------
	@echo If there are no errors then you
	@echo can run your code now.
	@echo 
	@echo To run your code look at the
	@echo "instructions in the README.md file"
	@echo -----------------------------------
	@echo

clean:
	$(RM) *.class