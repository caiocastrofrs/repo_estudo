function promiseTimeout(ms)
{
    return new Promise ((resolve, reject) =>
    {
        setTimeout(resolve, ms);
    });
}
async function simulateLongOperation()
{
    await promiseTimeout(1000);
    return 42;
}

async function run()
{
    const answer = await simulateLongOperation();
    console.log(answer);
}

run();