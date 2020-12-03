import math

puzzle = [int(l) for l in open('input_1.txt', 'r+').readlines()]


def find( l ) :
    for n1 in l:
        for n2 in l:
            for n3 in l:
                if n1+n2+n3 == 2020:
                    return [n1, n2, n3]


if __name__ == "__main__":
    print("hello")
    f = find(puzzle)
    print(f'liczby: {f}')
    print(f'product {math.prod(f)}')
