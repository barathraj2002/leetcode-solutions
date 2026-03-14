# Last updated: 3/14/2026, 9:12:37 PM
class Solution:
        def isValidSudoku(self, board: List[List[str]]) -> bool:
            rows = defaultdict(set)
            cols = defaultdict(set)
            grid = defaultdict(set)

            for row in range(len(board[0])):
                for col in range(len(board[0])):
                    val = board[row][col]
                    if val == ".":
                        continue
                    if val in rows[row] or val in cols[col] or val in grid[(row//3 , col//3)]:
                        return False
                    rows[row].add(val)
                    cols[col].add(val)
                    grid[ (row//3 , col//3)].add(val)

            return True