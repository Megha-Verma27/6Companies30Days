package com.company;

public class SquareNChessBoard {
    static Long squaresInChessBoard(Long N) {
        // code here
        Long ans = (N*(N+1)*(2*N+1))/6;
        return ans;
    }
}
