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

    slopes = [(1, 1), (3, 1), (5, 1), (7, 1), (1, 2)]

    answer = 1
    for step in slopes:
        pos = Vector(0, 0)
        cnt = 0
        for x in range(0, len(puzzle_split)-1, step[1]):
            hit = is_tree(pos)
            pos = pos.move(step)
            # print(f'row: {puzzle_split[x]} pos: {pos} hit: {hit}')
            cnt = cnt + is_tree(pos)
        answer = answer * cnt

    print(f'answer: {answer}')
