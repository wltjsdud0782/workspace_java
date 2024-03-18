package test.one;

import test.one.Song;

public class Song_test {
    public static void main(String[] args) {
        Song s1 = new Song();

        //배열 특정한 값 입력
        String[] com = {"김", "이", "박"};

        s1.initSong("자바", "선년", "그린", 2023, com);

        s1.printSong();
    }
}
