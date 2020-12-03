puzzle =\
    """\
..##.......
#...#...#..
.#....#..#.
..#.#...#.#
.#...##..#.
..#.##.....
.#.#.#....#
.#........#
#.##...#...
#...##....#
.#..#...#.#\
"""
puzzle_split = puzzle.split('\n')
with open('python/input_2.txt') as puzzle_in: 
    puzzle_split = [l.strip() for l in puzzle_in.readlines()]

r_max = len(puzzle_split[0])
d_max = len(puzzle_split)


class Vector:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def __str__(self):
        return f'x: {self.x} y: {self.y}'

    def move(self, other: tuple):
        ret = Vector((self.x + other[0]) % r_max, self.y + other[1])
        return ret

def is_tree(pos: Vector) -> int:
    return 1 if (puzzle_split[pos.y][pos.x] == '#') else 0


if __name__ == "__main__":
    print("hello")
    step = (3,1)

    cnt = 0
    pos = Vector(-3,-1)
    for row in puzzle_split:
        pos = pos.move(step)
        hit = is_tree(pos)
        print(f'row: {row} pos: {pos} hit: {hit}')
        cnt = cnt + is_tree(pos)
    
    print(f'tree cnt: {cnt}')
    print(f'last postion: {pos}')