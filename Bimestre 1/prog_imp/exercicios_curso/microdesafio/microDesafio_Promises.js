 /*
 const fs = require('fs');
 
// forma convencional
    fs.readFile('file.json', (err, data) => {
        if (err) {
            console.log(err)
        } else {
            console.log(JSON.parse(data));
        }
    });
 */
 const fs = require('fs');

// forma convencional
const promise = new Promise((resolve, reject) => 
{
    fs.readFile('file.json', (err, data) => {
        if (err) {
            reject(err)
        } else {
            resolve(JSON.parse(data));
        }
    });
});

promise.then((resolve) => 
{
    console.log(resolve)
}
).catch((reject) => 
{
    console.log(reject)
});

