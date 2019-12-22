import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterGradeBoundryTest {
    //public static void main(String[] args){}
        @Test
        public void Should_Return_X_0 () {
            assertEquals('X', LetterGrade.letterGrade(-1));
        }
        @Test
        public void Should_Return_X_100 () {
            assertEquals('X', LetterGrade.letterGrade(101));
        }
        @Test
        public void Should_Return_A_When_Score_Between_90_100 () {
            assertEquals('A', LetterGrade.letterGrade(99));
            assertEquals('A', LetterGrade.letterGrade(100));
            assertEquals('A', LetterGrade.letterGrade(91));
            assertEquals('A', LetterGrade.letterGrade(90));
        }
        @Test
        public void Should_Return_B_When_Score_Between_80_89 () {
            assertEquals('B', LetterGrade.letterGrade(89));
            assertEquals('B', LetterGrade.letterGrade(81));
            assertEquals('B', LetterGrade.letterGrade(80));
        }
        @Test
        public void Should_Return_C_When_Score_Between_70_79 () {
            assertEquals('C', LetterGrade.letterGrade(79));
            assertEquals('C', LetterGrade.letterGrade(71));
            assertEquals('C', LetterGrade.letterGrade(70));
        }
        @Test
        public void Should_Return_D_When_Score_Between_60_69 () {
            assertEquals('D', LetterGrade.letterGrade(69));
            assertEquals('D', LetterGrade.letterGrade(61));
            assertEquals('D', LetterGrade.letterGrade(60));
        }
        @Test
        public void Should_Return_F_When_Score_Between_0_59 () {
            assertEquals('F', LetterGrade.letterGrade(59));
            assertEquals('F', LetterGrade.letterGrade(1));
            assertEquals('F', LetterGrade.letterGrade(0));
        }
}