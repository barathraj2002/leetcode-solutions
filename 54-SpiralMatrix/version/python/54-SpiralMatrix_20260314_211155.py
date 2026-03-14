# Last updated: 3/14/2026, 9:11:55 PM
# Traverse each cell of the Sudoku board and for every non-empty value check whether it already exists in the same row, column, or 3×3 box; using three defaultdict(set) structures (rows, cols, grid) to store numbers seen so far, if the value is found in any corresponding set the board is invalid, otherwise add it to those sets and continue scanning the board.
1class Solution:
2        def isValidSudoku(self, board: List[List[str]]) -> bool:
3            rows = defaultdict(set)
4            cols = defaultdict(set)
5            grid = defaultdict(set)
6
7            for row in range(len(board[0])):
8                for col in range(len(board[0])):
9                    val = board[row][col]
10                    if val == ".":
11                        continue
12                    if val in rows[row] or val in cols[col] or val in grid[(row//3 , col//3)]:
13                        return False
14                    rows[row].add(val)
15                    cols[col].add(val)
16                    grid[ (row//3 , col//3)].add(val)
17
18            return True