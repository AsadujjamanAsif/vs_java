#include <iostream>

using namespace std;

int main() {
    int w;
    cin >> w;

    // Check if the weight allows for division into two even parts
    if (w % 2 == 0 && w > 2) {
        cout << "YES" << endl;
    } else {
        cout << "NO" << endl;
    }

    return 0;
}
