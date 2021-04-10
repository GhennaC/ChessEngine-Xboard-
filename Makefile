JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java
	
CLASSES = \
	org.src.pieces.ROOK.java\
	org.src.pieces.BISHOP.java\
	org.src.pieces.KNIGHT.java\
	org.src.pieces.KING.java\
	org.src.pieces.QUEEN.java\
        org.src.pieces.PAWN.java \
        org.src.pieces.Piece.java \
        org.src.Board.java \
	org.src.Move.java\
        org.src.Main.java

default: classes

classes: $(CLASSES:.java=.class)

run:
	java org.src.Main

clean:
	$(RM) *.class
