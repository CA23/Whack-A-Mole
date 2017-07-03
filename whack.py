import random
import copy

if __name__ == "__main__":
    print 'Welcome, choose a size of at most 20 for your whack_a_mole grid'
    print 'enter -1 and -1 for coordinates if you wish to give up'
    print 'the game uses 0 based indexing'
    print 'Example: for a grid size of 10 you need to enter coordinates from 0 to 9'

    size = int(raw_input("Enter the size of the grid you wish to whack moles in: "))
    attempts_left = size * 5

    grid = [['O']*10 for i in range(0, size)]


    l1 = random.sample(xrange(0, size), size)
    print l1
    l2 = random.sample(xrange(0, size), size)
    print l2

    for i in range(size):
        grid[l1[i]][l2[i]] = 'M'

    moles_left = size

    for s in grid:
        print ' '.join(s)

    while attempts_left > 0:
        print 'To whack, enter the x and y coordinates separated by a space: '
        a, b = map(int, raw_input().split())
        if a >= size or b >= size:
            print 'invalid coordinates, try again'
            continue
        elif a == -1 and b == -1:
            print 'Well played, try again later'
            for x in grid:
                print ' '.join(x)
            attempts_left = 0
        else:
            if grid[a][b] == 'M':
                grid[a][b] = 'W'
                print 'WHACK!'
                moles_left = moles_left - 1
                print str(moles_left)  + ' left to go'
            new_grid = copy.deepcopy(grid)
            for i in range(size):
                for j in range(size):
                    if new_grid[i][j] == 'M':
                        new_grid[i][j] = 'O'
            attempts_left = attempts_left - 1
            count = 0
            for t in new_grid:
                print ' '.join(t)
            for k in grid:
                for l in k:
                    if l == 'M':
                        count = count + 1
            if count == 0:
                print 'Congrats! You won! You had ' + str(attempts_left) + ' attempts left'
                attempts_left = 0
    for y in grid:
        print ' '.join(y)
    print 'End of Game'





