function promiseTimeout(ms)
{
    return new Promise((resolve,reject) =>
    {
        setTimeout(resolve, ms);
    });
}

promiseTimeout(2000)
    .then(() =>
    {
        console.log('done');
        return Promise.resolve(42);
    })
    .then((response) =>
    {
        console.log(response);
    })
    .catch(()=>
    {
        console.log('cool error handling');
    })
